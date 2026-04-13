package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.302f, 3.525f)
            curveToRelative(1.98f, -1.98f, 5.192f, -1.98f, 7.172f, 0f)
            curveToRelative(1.98f, 1.98f, 1.98f, 5.192f, 0f, 7.172f)
            lineToRelative(-9.778f, 9.778f)
            curveToRelative(-1.98f, 1.98f, -5.191f, 1.98f, -7.172f, 0f)
            curveToRelative(-1.98f, -1.98f, -1.98f, -5.191f, 0f, -7.172f)
            lineToRelative(9.778f, -9.778f)
            close()
            moveToRelative(6.111f, 1.061f)
            curveToRelative(-1.394f, -1.395f, -3.655f, -1.395f, -5.05f, 0f)
            lineToRelative(-4.359f, 4.359f)
            lineToRelative(5.05f, 5.05f)
            lineToRelative(4.36f, -4.358f)
            curveToRelative(1.394f, -1.395f, 1.394f, -3.656f, 0f, -5.051f)
            close()
            moveToRelative(-8.606f, 13.691f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.441f, 1.44f)
            curveToRelative(-0.578f, 0.578f, -1.51f, 0.587f, -2.1f, 0.022f)
            lineTo(6.19f, 18.663f)
            curveToRelative(-0.298f, -0.287f, -0.773f, -0.277f, -1.06f, 0.021f)
            curveToRelative(-0.287f, 0.3f, -0.277f, 0.774f, 0.022f, 1.06f)
            lineToRelative(0.016f, 0.017f)
            curveToRelative(1.178f, 1.131f, 3.045f, 1.112f, 4.2f, -0.043f)
            lineToRelative(1.44f, -1.44f)
            close()
        }
    }.build()
}
