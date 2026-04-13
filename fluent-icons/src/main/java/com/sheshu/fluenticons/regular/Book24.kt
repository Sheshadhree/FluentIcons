package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Book24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Book24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
            verticalLineTo(6f)
            close()
            moveToRelative(1.5f, 1.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(1f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(14.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(5.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 22f, 4f, 20.88f, 4f, 19.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(5.5f, 18f)
            horizontalLineTo(19f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
