package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pen16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.733f, 2.56f)
            curveToRelative(0.748f, -0.747f, 1.96f, -0.747f, 2.707f, 0f)
            curveToRelative(0.748f, 0.748f, 0.748f, 1.96f, 0f, 2.708f)
            lineTo(12.707f, 6f)
            lineToRelative(0.263f, 0.263f)
            curveToRelative(0.683f, 0.683f, 0.683f, 1.791f, 0f, 2.475f)
            lineToRelative(-1.116f, 1.116f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(1.117f, -1.117f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(12f, 6.708f)
            lineToRelative(-5.955f, 5.954f)
            curveToRelative(-0.18f, 0.181f, -0.401f, 0.317f, -0.644f, 0.398f)
            lineToRelative(-2.743f, 0.915f)
            curveToRelative(-0.18f, 0.06f, -0.378f, 0.013f, -0.511f, -0.121f)
            curveToRelative(-0.134f, -0.134f, -0.181f, -0.332f, -0.121f, -0.512f)
            lineTo(2.94f, 10.6f)
            curveToRelative(0.08f, -0.242f, 0.217f, -0.463f, 0.398f, -0.644f)
            lineToRelative(7.395f, -7.394f)
            close()
        }
    }.build()
}
