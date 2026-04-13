package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RibbonOff12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonOff12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.68f, 3.388f)
            curveTo(2.563f, 3.738f, 2.5f, 4.11f, 2.5f, 4.5f)
            curveTo(2.5f, 6.433f, 4.067f, 8f, 6f, 8f)
            curveToRelative(0.389f, 0f, 0.763f, -0.063f, 1.112f, -0.18f)
            lineToRelative(0.732f, 0.73f)
            curveTo(7.292f, 8.839f, 6.664f, 9f, 6f, 9f)
            curveTo(5.271f, 9f, 4.588f, 8.805f, 4f, 8.465f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.184f, 0.101f, 0.354f, 0.264f, 0.44f)
            curveToRelative(0.163f, 0.088f, 0.36f, 0.078f, 0.513f, -0.024f)
            lineTo(6f, 10.101f)
            lineToRelative(1.223f, 0.815f)
            curveToRelative(0.153f, 0.102f, 0.35f, 0.112f, 0.513f, 0.025f)
            curveTo(7.899f, 10.854f, 8f, 10.684f, 8f, 10.5f)
            verticalLineTo(8.707f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-9f, -9f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(2.68f, 3.388f)
            close()
            moveTo(9.5f, 4.5f)
            curveToRelative(0f, 0.808f, -0.274f, 1.552f, -0.734f, 2.145f)
            lineToRelative(-4.91f, -4.911f)
            curveTo(4.447f, 1.274f, 5.191f, 1f, 6f, 1f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
