package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PortMicroUsb24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortMicroUsb24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 12.83f)
            verticalLineTo(13f)
            curveToRelative(-0.002f, 0.53f, -0.213f, 1.038f, -0.587f, 1.412f)
            curveTo(18.038f, 14.787f, 17.53f, 14.998f, 17f, 15f)
            horizontalLineTo(7f)
            curveToRelative(-0.53f, -0.002f, -1.038f, -0.213f, -1.412f, -0.588f)
            curveTo(5.213f, 14.038f, 5.002f, 13.53f, 5f, 13f)
            verticalLineToRelative(-0.17f)
            curveToRelative(0f, -0.264f, 0.052f, -0.525f, 0.154f, -0.769f)
            curveToRelative(0.1f, -0.243f, 0.25f, -0.465f, 0.436f, -0.651f)
            lineToRelative(1.82f, -1.82f)
            curveToRelative(0.186f, -0.187f, 0.408f, -0.335f, 0.651f, -0.436f)
            curveTo(8.305f, 9.052f, 8.566f, 9f, 8.83f, 9f)
            horizontalLineToRelative(6.34f)
            curveToRelative(0.264f, 0f, 0.525f, 0.052f, 0.769f, 0.154f)
            curveToRelative(0.243f, 0.1f, 0.465f, 0.25f, 0.651f, 0.436f)
            lineToRelative(1.82f, 1.82f)
            curveToRelative(0.187f, 0.186f, 0.335f, 0.408f, 0.436f, 0.651f)
            curveTo(18.948f, 12.305f, 19f, 12.566f, 19f, 12.83f)
            close()
        }
    }.build()
}
