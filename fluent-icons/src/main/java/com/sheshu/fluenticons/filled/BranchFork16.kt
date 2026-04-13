package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BranchFork16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BranchFork16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3.5f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            verticalLineTo(8f)
            horizontalLineToRelative(4.5f)
            curveTo(10.328f, 8f, 11f, 7.328f, 11f, 6.5f)
            verticalLineTo(5.95f)
            curveTo(9.859f, 5.718f, 9f, 4.71f, 9f, 3.5f)
            curveTo(9f, 2.12f, 10.12f, 1f, 11.5f, 1f)
            reflectiveCurveTo(14f, 2.12f, 14f, 3.5f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            verticalLineTo(6.5f)
            curveTo(12f, 7.88f, 10.88f, 9f, 9.5f, 9f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.05f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            curveTo(7f, 13.88f, 5.88f, 15f, 4.5f, 15f)
            reflectiveCurveTo(2f, 13.88f, 2f, 12.5f)
            curveToRelative(0f, -1.21f, 0.859f, -2.218f, 2f, -2.45f)
            verticalLineToRelative(-4.1f)
            curveTo(2.859f, 5.718f, 2f, 4.71f, 2f, 3.5f)
            curveTo(2f, 2.12f, 3.12f, 1f, 4.5f, 1f)
            reflectiveCurveTo(7f, 2.12f, 7f, 3.5f)
            close()
        }
    }.build()
}
