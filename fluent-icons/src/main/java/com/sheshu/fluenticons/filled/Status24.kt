package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Status24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Status24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.025f, 3.025f)
            curveToRelative(1.367f, -1.367f, 3.583f, -1.367f, 4.95f, 0f)
            reflectiveCurveToRelative(1.367f, 3.583f, 0f, 4.95f)
            lineToRelative(-6.06f, 6.06f)
            curveToRelative(-0.346f, 0.346f, -0.78f, 0.594f, -1.254f, 0.717f)
            lineToRelative(-4.723f, 1.224f)
            curveToRelative(-0.257f, 0.067f, -0.53f, -0.008f, -0.718f, -0.196f)
            curveToRelative(-0.188f, -0.188f, -0.263f, -0.46f, -0.196f, -0.718f)
            lineToRelative(1.224f, -4.723f)
            curveToRelative(0.123f, -0.475f, 0.37f, -0.908f, 0.718f, -1.255f)
            lineToRelative(6.06f, -6.059f)
            close()
            moveToRelative(-1.694f, 0.28f)
            curveTo(13.588f, 3.106f, 12.806f, 3f, 12f, 3f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            curveToRelative(0f, -0.806f, -0.106f, -1.588f, -0.305f, -2.331f)
            lineToRelative(-1.27f, 1.27f)
            curveToRelative(0.05f, 0.346f, 0.075f, 0.7f, 0.075f, 1.061f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(0.36f, 0f, 0.715f, 0.025f, 1.061f, 0.074f)
            lineToRelative(1.27f, -1.27f)
            close()
        }
    }.build()
}
