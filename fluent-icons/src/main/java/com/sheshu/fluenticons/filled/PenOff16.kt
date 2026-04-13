package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PenOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PenOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 9.707f)
            lineToRelative(5.146f, 5.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(6.293f, 7f)
            lineTo(3.338f, 9.955f)
            curveToRelative(-0.18f, 0.18f, -0.317f, 0.401f, -0.398f, 0.644f)
            lineToRelative(-0.914f, 2.743f)
            curveToRelative(-0.06f, 0.18f, -0.013f, 0.378f, 0.12f, 0.512f)
            curveToRelative(0.134f, 0.134f, 0.333f, 0.18f, 0.512f, 0.12f)
            lineToRelative(2.743f, -0.914f)
            curveToRelative(0.243f, -0.08f, 0.463f, -0.217f, 0.644f, -0.398f)
            lineTo(9f, 9.707f)
            close()
            moveToRelative(3.263f, -1.677f)
            lineToRelative(-1.056f, 1.056f)
            lineToRelative(0.707f, 0.707f)
            lineToRelative(1.056f, -1.056f)
            curveToRelative(0.683f, -0.683f, 0.683f, -1.791f, 0f, -2.474f)
            lineTo(12.707f, 6f)
            lineToRelative(0.733f, -0.732f)
            curveToRelative(0.748f, -0.748f, 0.748f, -1.96f, 0f, -2.707f)
            curveToRelative(-0.747f, -0.748f, -1.96f, -0.748f, -2.707f, 0f)
            lineTo(7.707f, 5.585f)
            lineToRelative(2.707f, 2.707f)
            lineTo(12f, 6.707f)
            lineToRelative(0.263f, 0.263f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            close()
        }
    }.build()
}
