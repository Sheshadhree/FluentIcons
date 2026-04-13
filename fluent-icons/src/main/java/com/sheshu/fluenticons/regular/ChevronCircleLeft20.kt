package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronCircleLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronCircleLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(8f, 7f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
            moveToRelative(-6.146f, -3.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveTo(7.553f, 9.74f, 7.5f, 9.867f, 7.5f, 10f)
            curveToRelative(0f, 0.133f, 0.053f, 0.26f, 0.146f, 0.354f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(8.707f, 10f)
            lineToRelative(3.147f, -3.146f)
            close()
        }
    }.build()
}
