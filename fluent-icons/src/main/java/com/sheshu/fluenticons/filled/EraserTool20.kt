package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EraserTool20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserTool20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2.5f)
            curveTo(4f, 2.224f, 3.776f, 2f, 3.5f, 2f)
            reflectiveCurveTo(3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(12f)
            curveTo(3f, 16.433f, 4.567f, 18f, 6.5f, 18f)
            horizontalLineToRelative(7f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-12f)
            curveTo(17f, 2.224f, 16.776f, 2f, 16.5f, 2f)
            reflectiveCurveTo(16f, 2.224f, 16f, 2.5f)
            verticalLineTo(6f)
            horizontalLineTo(4f)
            verticalLineTo(2.5f)
            close()
            moveTo(4f, 10f)
            verticalLineTo(7f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(3f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
