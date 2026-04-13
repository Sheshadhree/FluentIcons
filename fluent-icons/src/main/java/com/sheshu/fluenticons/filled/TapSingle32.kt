package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TapSingle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TapSingle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            curveToRelative(0f, 1.302f, 0.415f, 2.508f, 1.12f, 3.491f)
            curveToRelative(-0.734f, -0.015f, -1.454f, 0.118f, -2.122f, 0.38f)
            curveTo(8.362f, 13.724f, 8f, 12.404f, 8f, 11f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            curveToRelative(0f, 0.895f, -0.147f, 1.756f, -0.418f, 2.56f)
            curveToRelative(-0.174f, -0.053f, -0.352f, -0.097f, -0.534f, -0.132f)
            lineToRelative(-1.444f, -0.28f)
            curveTo(21.86f, 12.483f, 22f, 11.759f, 22f, 11f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
            moveToRelative(0.002f, 3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(5.495f)
            lineToRelative(-0.449f, -0.189f)
            curveToRelative(-2.23f, -0.937f, -4.777f, 0.306f, -5.41f, 2.642f)
            lineToRelative(-0.09f, 0.332f)
            curveToRelative(-0.212f, 0.78f, 0.232f, 1.562f, 0.963f, 1.817f)
            curveToRelative(4.74f, 1.653f, 6.227f, 3.924f, 6.801f, 5.503f)
            curveToRelative(0.3f, 0.824f, 1.116f, 1.48f, 2.113f, 1.398f)
            lineToRelative(4.76f, -0.388f)
            curveToRelative(1.256f, -0.102f, 2.315f, -0.979f, 2.649f, -2.194f)
            lineToRelative(1.52f, -5.526f)
            curveToRelative(0.618f, -2.247f, -0.809f, -4.545f, -3.097f, -4.988f)
            lineToRelative(-3.76f, -0.727f)
            verticalLineTo(11f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
