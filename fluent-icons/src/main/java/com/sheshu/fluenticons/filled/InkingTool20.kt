package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingTool20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingTool20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.52f, 15f)
            curveToRelative(-0.014f, 0.165f, -0.02f, 0.332f, -0.02f, 0.5f)
            curveToRelative(0f, 0.582f, 0.072f, 1.162f, 0.273f, 1.616f)
            curveTo(8.981f, 17.586f, 9.373f, 18f, 10f, 18f)
            curveToRelative(0.627f, 0f, 1.019f, -0.414f, 1.227f, -0.884f)
            curveToRelative(0.2f, -0.454f, 0.273f, -1.034f, 0.273f, -1.616f)
            curveToRelative(0f, -0.168f, -0.006f, -0.335f, -0.02f, -0.5f)
            horizontalLineTo(8.52f)
            close()
            moveTo(2.5f, 5.5f)
            verticalLineToRelative(-3f)
            curveTo(2.5f, 2.224f, 2.724f, 2f, 3f, 2f)
            horizontalLineToRelative(14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveTo(17.5f, 6.328f, 16.828f, 7f, 16f, 7f)
            horizontalLineTo(4f)
            curveTo(3.172f, 7f, 2.5f, 6.328f, 2.5f, 5.5f)
            close()
            moveTo(4.75f, 8f)
            lineToRelative(2.724f, 5.447f)
            curveTo(7.643f, 13.786f, 7.989f, 14f, 8.368f, 14f)
            horizontalLineToRelative(3.264f)
            curveToRelative(0.379f, 0f, 0.725f, -0.214f, 0.894f, -0.553f)
            lineTo(15.25f, 8f)
            horizontalLineTo(4.75f)
            close()
        }
    }.build()
}
