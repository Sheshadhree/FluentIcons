package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PulseSquare20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PulseSquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(5.97f, 1.332f)
            curveTo(8.9f, 6.134f, 8.715f, 6.002f, 8.505f, 6f)
            curveToRelative(-0.21f, -0.002f, -0.399f, 0.128f, -0.472f, 0.324f)
            lineTo(6.654f, 10f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 10f, 5f, 10.224f, 5f, 10.5f)
            reflectiveCurveTo(5.224f, 11f, 5.5f, 11f)
            horizontalLineTo(7f)
            curveToRelative(0.208f, 0f, 0.395f, -0.13f, 0.468f, -0.324f)
            lineToRelative(1.02f, -2.721f)
            lineToRelative(2.041f, 5.713f)
            curveToRelative(0.068f, 0.189f, 0.24f, 0.319f, 0.44f, 0.331f)
            curveToRelative(0.2f, 0.012f, 0.389f, -0.096f, 0.478f, -0.275f)
            lineTo(12.81f, 11f)
            horizontalLineToRelative(1.69f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 10f, 14.5f, 10f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.19f, 0f, -0.363f, 0.107f, -0.447f, 0.276f)
            lineToRelative(-0.976f, 1.952f)
            lineTo(8.97f, 6.332f)
            close()
        }
    }.build()
}
