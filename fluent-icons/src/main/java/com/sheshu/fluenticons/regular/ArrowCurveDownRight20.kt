package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCurveDownRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCurveDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.743f, 2.929f)
            curveTo(6.506f, 2.787f, 6.429f, 2.479f, 6.57f, 2.243f)
            curveToRelative(0.142f, -0.237f, 0.45f, -0.314f, 0.686f, -0.172f)
            curveToRelative(1.315f, 0.79f, 2.269f, 1.732f, 2.882f, 3.027f)
            curveTo(10.747f, 6.381f, 11f, 7.965f, 11f, 10f)
            verticalLineToRelative(6.293f)
            lineToRelative(3.146f, -3.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-4f, -4f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineTo(10f, 16.293f)
            verticalLineTo(10f)
            curveToRelative(0f, -1.965f, -0.247f, -3.38f, -0.764f, -4.473f)
            curveToRelative(-0.512f, -1.08f, -1.308f, -1.887f, -2.493f, -2.598f)
            close()
        }
    }.build()
}
