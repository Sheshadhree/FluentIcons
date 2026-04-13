package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareArrowForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareArrowForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(5.772f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
            curveToRelative(1.289f, 0f, 2.49f, 0.375f, 3.5f, 1.022f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(12f, 17.5f)
            curveToRelative(0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveToRelative(-2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveToRelative(-5.5f, 2.462f, -5.5f, 5.5f)
            close()
            moveToRelative(6.646f, -2.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(19.293f, 17f)
            horizontalLineTo(17.25f)
            curveTo(16.007f, 17f, 15f, 18.007f, 15f, 19.25f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(14f, 19.776f, 14f, 19.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(2.043f)
            lineToRelative(-0.647f, -0.646f)
            close()
        }
    }.build()
}
