package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowWrap32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowWrap32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 6.06f, 3.56f, 5.5f, 4.25f, 5.5f)
            horizontalLineToRelative(19f)
            curveToRelative(3.176f, 0f, 5.75f, 2.574f, 5.75f, 5.75f)
            reflectiveCurveTo(26.426f, 17f, 23.25f, 17f)
            horizontalLineTo(8.75f)
            curveToRelative(-1.795f, 0f, -3.25f, 1.455f, -3.25f, 3.25f)
            reflectiveCurveToRelative(1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(16.982f)
            lineToRelative(-0.866f, -0.866f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineTo(25.732f, 26f)
            horizontalLineTo(8.75f)
            curveTo(5.574f, 26f, 3f, 23.426f, 3f, 20.25f)
            reflectiveCurveToRelative(2.574f, -5.75f, 5.75f, -5.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            reflectiveCurveTo(25.045f, 8f, 23.25f, 8f)
            horizontalLineToRelative(-19f)
            curveTo(3.56f, 8f, 3f, 7.44f, 3f, 6.75f)
            close()
        }
    }.build()
}
