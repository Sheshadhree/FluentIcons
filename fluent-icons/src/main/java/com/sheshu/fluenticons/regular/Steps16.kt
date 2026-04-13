package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Steps16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Steps16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 13f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, -0.449f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.551f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.551f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.551f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, 0.449f, 1f, 1f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1f)
            verticalLineTo(2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.551f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.551f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(10f, -0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.551f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, 0.449f, -1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, 0.449f, -1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.551f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.379f, 0f, 2.5f, -1.122f, 2.5f, -2.5f)
            close()
            moveTo(10f, 11f)
            curveToRelative(0.552f, 0f, 1f, -0.449f, 1f, -1f)
            verticalLineTo(8f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(7f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
