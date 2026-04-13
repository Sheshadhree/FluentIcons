package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EraserTool20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EraserTool20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(3.776f, 2f, 4f, 2.224f, 4f, 2.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(12f)
            verticalLineTo(2.5f)
            curveTo(16f, 2.224f, 16.224f, 2f, 16.5f, 2f)
            reflectiveCurveTo(17f, 2.224f, 17f, 2.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            curveTo(4.567f, 18f, 3f, 16.433f, 3f, 14.5f)
            verticalLineToRelative(-12f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            close()
            moveTo(4f, 11f)
            verticalLineToRelative(3.5f)
            curveTo(4f, 15.88f, 5.12f, 17f, 6.5f, 17f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(11f)
            horizontalLineTo(4f)
            close()
            moveToRelative(12f, -1f)
            verticalLineTo(7f)
            horizontalLineTo(4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(12f)
            close()
        }
    }.build()
}
