package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MusicNoteOff120: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MusicNoteOff120",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(9.5f, 10.207f)
            verticalLineToRelative(2.198f)
            curveTo(8.916f, 11.845f, 8.123f, 11.5f, 7.25f, 11.5f)
            curveTo(5.455f, 11.5f, 4f, 12.955f, 4f, 14.75f)
            reflectiveCurveTo(5.455f, 18f, 7.25f, 18f)
            reflectiveCurveToRelative(3.25f, -1.455f, 3.25f, -3.25f)
            curveToRelative(0f, -0.06f, -0.002f, -0.12f, -0.005f, -0.18f)
            curveToRelative(0.003f, -0.023f, 0.005f, -0.046f, 0.005f, -0.07f)
            verticalLineToRelative(-3.293f)
            lineToRelative(6.646f, 6.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(7.647f, 5.03f)
            verticalLineToRelative(1.202f)
            lineToRelative(-1f, -1f)
            verticalLineTo(2.5f)
            curveToRelative(0f, -0.159f, 0.075f, -0.308f, 0.203f, -0.402f)
            curveToRelative(0.128f, -0.095f, 0.292f, -0.122f, 0.444f, -0.076f)
            lineToRelative(5.088f, 1.566f)
            curveTo(16.285f, 3.91f, 17f, 4.88f, 17f, 5.978f)
            verticalLineTo(8.5f)
            curveToRelative(0f, 0.159f, -0.075f, 0.308f, -0.203f, 0.402f)
            curveToRelative(-0.128f, 0.095f, -0.292f, 0.123f, -0.444f, 0.076f)
            lineTo(10.5f, 7.177f)
            close()
        }
    }.build()
}
