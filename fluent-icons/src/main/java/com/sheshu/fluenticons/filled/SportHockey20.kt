package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SportHockey20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SportHockey20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.972f, 2.063f)
            curveToRelative(1.34f, -0.272f, 2.604f, 0.364f, 3.444f, 1.305f)
            lineToRelative(1.715f, 1.922f)
            curveToRelative(0.748f, 0.839f, 1.081f, 2.018f, 0.73f, 3.133f)
            curveToRelative(-2.11f, 6.706f, -7.03f, 9.074f, -10.189f, 9.55f)
            curveToRelative(-0.906f, 0.136f, -1.759f, -0.227f, -2.388f, -0.785f)
            lineTo(3.47f, 15.582f)
            curveToRelative(-1.214f, -1.075f, -1.823f, -2.775f, -1.259f, -4.371f)
            curveToRelative(2.115f, -5.987f, 6.454f, -8.475f, 9.76f, -9.148f)
            close()
            moveToRelative(2.522f, 3.513f)
            curveToRelative(0.042f, -0.273f, -0.145f, -0.528f, -0.418f, -0.57f)
            curveToRelative(-0.273f, -0.042f, -0.528f, 0.145f, -0.57f, 0.418f)
            curveToRelative(-0.374f, 2.424f, -1.613f, 4.42f, -3.048f, 5.895f)
            curveToRelative(-1.443f, 1.482f, -3.048f, 2.402f, -4.095f, 2.7f)
            curveToRelative(-0.266f, 0.076f, -0.42f, 0.352f, -0.344f, 0.618f)
            curveToRelative(0.076f, 0.265f, 0.352f, 0.42f, 0.618f, 0.344f)
            curveToRelative(1.25f, -0.356f, 3.001f, -1.386f, 4.537f, -2.965f)
            curveToRelative(1.544f, -1.586f, 2.907f, -3.764f, 3.32f, -6.44f)
            close()
        }
    }.build()
}
