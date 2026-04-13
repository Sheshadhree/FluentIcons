package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Balloon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Balloon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 9f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            curveToRelative(0f, 2.025f, -0.67f, 4.236f, -1.85f, 5.956f)
            curveToRelative(-1.042f, 1.52f, -2.543f, 2.731f, -4.4f, 2.992f)
            verticalLineToRelative(0.302f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.25f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(13.5f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-0.302f)
            curveToRelative(-1.857f, -0.261f, -3.357f, -1.473f, -4.4f, -2.992f)
            curveTo(5.67f, 13.236f, 5f, 11.025f, 5f, 9f)
            close()
            moveToRelative(7.92f, -3.894f)
            curveToRelative(-0.403f, -0.095f, -0.807f, 0.155f, -0.902f, 0.559f)
            curveToRelative(-0.095f, 0.403f, 0.155f, 0.806f, 0.558f, 0.901f)
            curveToRelative(0.916f, 0.216f, 1.639f, 0.938f, 1.856f, 1.853f)
            curveToRelative(0.096f, 0.403f, 0.5f, 0.652f, 0.903f, 0.556f)
            curveToRelative(0.403f, -0.096f, 0.652f, -0.5f, 0.556f, -0.903f)
            curveToRelative(-0.348f, -1.467f, -1.503f, -2.62f, -2.971f, -2.966f)
            close()
        }
    }.build()
}
