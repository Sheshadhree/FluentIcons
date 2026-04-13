package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AirplaneLanding16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AirplaneLanding16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.848f, 2.845f)
            lineToRelative(1.07f, 2.194f)
            lineToRelative(-1.032f, 0.01f)
            lineTo(6f, 3.998f)
            verticalLineTo(3.494f)
            curveTo(6.007f, 1.91f, 8.153f, 1.417f, 8.848f, 2.845f)
            close()
            moveToRelative(3.123f, 3.174f)
            curveTo(13.64f, 6.003f, 15f, 7.351f, 15f, 9.02f)
            verticalLineToRelative(0.482f)
            curveToRelative(0f, 1.028f, -1.012f, 1.752f, -1.985f, 1.42f)
            lineToRelative(-2.242f, -0.767f)
            lineToRelative(-5.236f, 1.763f)
            curveTo(4f, 12.435f, 2.85f, 10.487f, 4.044f, 9.39f)
            lineToRelative(1.22f, -1.119f)
            lineTo(2.02f, 7.163f)
            curveTo(1.072f, 6.84f, 0.703f, 5.69f, 1.287f, 4.873f)
            lineToRelative(1.719f, -2.41f)
            curveTo(3.626f, 1.593f, 5f, 2.032f, 5f, 3.103f)
            verticalLineToRelative(1.596f)
            lineToRelative(3.544f, 1.29f)
            curveToRelative(0.112f, 0.04f, 0.231f, 0.06f, 0.351f, 0.06f)
            lineToRelative(3.077f, -0.03f)
            close()
            moveTo(1f, 14.5f)
            curveTo(1f, 14.224f, 1.224f, 14f, 1.5f, 14f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 15f, 14.5f, 15f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 15f, 1f, 14.776f, 1f, 14.5f)
            close()
        }
    }.build()
}
