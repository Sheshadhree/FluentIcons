package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowWrapUpToDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowWrapUpToDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(6.06f, 3f, 5.5f, 3.56f, 5.5f, 4.25f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 3.176f, 2.574f, 5.75f, 5.75f, 5.75f)
            reflectiveCurveTo(17f, 26.426f, 17f, 23.25f)
            verticalLineTo(8.75f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(16.982f)
            lineToRelative(-0.866f, -0.866f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(3f, 3f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineTo(26f, 25.732f)
            verticalLineTo(8.75f)
            curveTo(26f, 5.574f, 23.426f, 3f, 20.25f, 3f)
            reflectiveCurveTo(14.5f, 5.574f, 14.5f, 8.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            reflectiveCurveTo(8f, 25.045f, 8f, 23.25f)
            verticalLineToRelative(-19f)
            curveTo(8f, 3.56f, 7.44f, 3f, 6.75f, 3f)
            close()
        }
    }.build()
}
