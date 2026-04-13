package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TreeDeciduous20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TreeDeciduous20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(8.373f, 2f, 7.006f, 3.11f, 6.613f, 4.613f)
            curveTo(5.11f, 5.006f, 4f, 6.373f, 4f, 8f)
            curveToRelative(0f, 0.202f, 0.017f, 0.4f, 0.05f, 0.593f)
            curveTo(3.116f, 9.221f, 2.5f, 10.288f, 2.5f, 11.5f)
            curveTo(2.5f, 13.433f, 4.067f, 15f, 6f, 15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.75f)
            curveTo(8f, 17.44f, 8.56f, 18f, 9.25f, 18f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(2f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -1.212f, -0.616f, -2.279f, -1.55f, -2.907f)
            curveTo(15.983f, 8.4f, 16f, 8.202f, 16f, 8f)
            curveToRelative(0f, -1.627f, -1.11f, -2.994f, -2.613f, -3.387f)
            curveTo(12.994f, 3.11f, 11.627f, 2f, 10f, 2f)
            close()
            moveTo(9f, 15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.138f, -0.112f, 0.25f, -0.25f, 0.25f)
            horizontalLineToRelative(-1.5f)
            curveTo(9.112f, 17f, 9f, 16.888f, 9f, 16.75f)
            verticalLineTo(15f)
            close()
        }
    }.build()
}
