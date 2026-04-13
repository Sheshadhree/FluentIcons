package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ribbon12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ribbon12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 8f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(7.933f, 1f, 6f, 1f)
            reflectiveCurveTo(2.5f, 2.567f, 2.5f, 4.5f)
            reflectiveCurveTo(4.067f, 8f, 6f, 8f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(0.729f, 0f, 1.412f, -0.195f, 2f, -0.535f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.184f, -0.101f, 0.354f, -0.264f, 0.44f)
            curveToRelative(-0.163f, 0.088f, -0.36f, 0.078f, -0.513f, -0.024f)
            lineTo(6f, 10.101f)
            lineToRelative(-1.223f, 0.815f)
            curveToRelative(-0.153f, 0.102f, -0.35f, 0.112f, -0.513f, 0.025f)
            curveTo(4.101f, 10.854f, 4f, 10.684f, 4f, 10.5f)
            verticalLineTo(8.465f)
            curveTo(4.588f, 8.805f, 5.271f, 9f, 6f, 9f)
            close()
        }
    }.build()
}
