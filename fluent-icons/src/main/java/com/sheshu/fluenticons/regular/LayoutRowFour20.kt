package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LayoutRowFour20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LayoutRowFour20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(-3f, -2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            close()
            moveTo(4f, 10.5f)
            horizontalLineToRelative(12f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineToRelative(-2.5f)
            close()
            moveToRelative(0f, -1f)
            verticalLineTo(7f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(4f)
            close()
            moveTo(6f, 16f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
