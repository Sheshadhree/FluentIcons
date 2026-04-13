package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Smartwatch20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Smartwatch20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(6.895f, 2f, 6f, 2.896f, 6f, 4f)
            verticalLineToRelative(0.17f)
            curveTo(6.313f, 4.06f, 6.65f, 4f, 7f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(0.35f, 0f, 0.687f, 0.06f, 1f, 0.17f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.104f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            close()
            moveTo(7f, 5f)
            curveTo(5.895f, 5f, 5f, 5.895f, 5f, 7f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 11f)
            curveToRelative(-0.35f, 0f, -0.687f, -0.06f, -1f, -0.17f)
            verticalLineTo(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-0.17f)
            curveTo(13.687f, 15.94f, 13.35f, 16f, 13f, 16f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
