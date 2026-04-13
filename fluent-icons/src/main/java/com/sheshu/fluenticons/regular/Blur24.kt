package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Blur24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Blur24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 12f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            curveToRelative(1.84f, 0f, 3.551f, 0.552f, 4.977f, 1.5f)
            horizontalLineTo(12f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(6.708f)
            curveToRelative(-1.648f, 1.841f, -4.042f, 3f, -6.708f, 3f)
            curveToRelative(-4.97f, 0f, -9f, -4.03f, -9f, -9f)
            close()
            moveToRelative(15.225f, -6.5f)
            horizontalLineTo(12f)
            verticalLineTo(7f)
            horizontalLineToRelative(7.485f)
            curveToRelative(-0.365f, -0.545f, -0.788f, -1.048f, -1.26f, -1.5f)
            close()
            moveTo(12f, 8f)
            horizontalLineToRelative(8.064f)
            curveToRelative(0.238f, 0.477f, 0.434f, 0.979f, 0.584f, 1.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            close()
            moveToRelative(8.876f, 2.5f)
            horizontalLineTo(12f)
            verticalLineTo(12f)
            horizontalLineToRelative(9f)
            curveToRelative(0f, -0.511f, -0.043f, -1.012f, -0.124f, -1.5f)
            close()
            moveTo(12f, 13f)
            horizontalLineToRelative(8.945f)
            curveToRelative(-0.057f, 0.514f, -0.157f, 1.015f, -0.297f, 1.5f)
            horizontalLineTo(12f)
            verticalLineTo(13f)
            close()
            moveToRelative(8.294f, 2.5f)
            horizontalLineTo(12f)
            verticalLineTo(17f)
            horizontalLineToRelative(7.485f)
            curveToRelative(0.314f, -0.47f, 0.586f, -0.972f, 0.81f, -1.5f)
            close()
        }
    }.build()
}
