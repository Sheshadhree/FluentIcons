package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(3.642f, 3.64f)
            lineToRelative(-2.766f, 2.76f)
            curveToRelative(-0.783f, 0.78f, -0.783f, 2.048f, -0.002f, 2.83f)
            lineToRelative(4.949f, 4.948f)
            curveToRelative(0.78f, 0.781f, 2.047f, 0.781f, 2.828f, 0f)
            lineToRelative(2.764f, -2.764f)
            lineToRelative(3.585f, 3.586f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(17.428f, 10.4f)
            lineToRelative(-2.453f, 2.453f)
            lineToRelative(-7.771f, -7.771f)
            lineToRelative(2.5f, -2.494f)
            curveTo(10.082f, 2.212f, 10.595f, 2f, 11.129f, 2.005f)
            lineToRelative(4.89f, 0.032f)
            curveToRelative(1.099f, 0.007f, 1.986f, 0.899f, 1.988f, 1.997f)
            lineToRelative(0.007f, 4.95f)
            curveToRelative(0f, 0.531f, -0.21f, 1.041f, -0.586f, 1.417f)
            close()
            moveTo(14f, 7.001f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -0.553f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.447f, -1f, 1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
