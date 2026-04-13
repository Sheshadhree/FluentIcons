package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4.633f, 4.634f)
            curveTo(6.472f, 8.55f, 6.205f, 9.26f, 6.08f, 10.02f)
            curveTo(3.792f, 10.231f, 2f, 12.156f, 2f, 14.5f)
            curveTo(2f, 16.985f, 4.015f, 19f, 6.5f, 19f)
            horizontalLineToRelative(11f)
            curveToRelative(0.142f, 0f, 0.282f, -0.006f, 0.42f, -0.02f)
            lineToRelative(2.8f, 2.8f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(22f, 14.5f)
            curveToRelative(0f, 1.196f, -0.467f, 2.284f, -1.228f, 3.09f)
            lineTo(8.99f, 5.808f)
            curveTo(9.875f, 5.294f, 10.903f, 5f, 12f, 5f)
            curveToRelative(2.98f, 0f, 5.452f, 2.172f, 5.92f, 5.02f)
            curveTo(20.208f, 10.23f, 22f, 12.155f, 22f, 14.5f)
            close()
        }
    }.build()
}
