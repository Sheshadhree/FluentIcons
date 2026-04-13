package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dust20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dust20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(6.164f, 2f, 5.75f, 2f)
            reflectiveCurveTo(5f, 2.336f, 5f, 2.75f)
            reflectiveCurveTo(5.336f, 3.5f, 5.75f, 3.5f)
            close()
            moveToRelative(2.34f, 2.652f)
            curveTo(8.48f, 4.35f, 10.082f, 3f, 12f, 3f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 1.195f, -0.524f, 2.267f, -1.354f, 3f)
            curveTo(15.476f, 10.732f, 16f, 11.805f, 16f, 13f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-1.917f, 0f, -3.52f, -1.349f, -3.91f, -3.15f)
            curveToRelative(-0.346f, 0.098f, -0.712f, 0.151f, -1.09f, 0.151f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            curveToRelative(0.378f, 0f, 0.744f, 0.052f, 1.09f, 0.15f)
            close()
            moveTo(5.75f, 18f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(6.164f, 16.5f, 5.75f, 16.5f)
            reflectiveCurveTo(5f, 16.836f, 5f, 17.25f)
            reflectiveCurveTo(5.336f, 18f, 5.75f, 18f)
            close()
            moveTo(19f, 10f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(17.5f, 10.414f, 17.5f, 10f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(19f, 9.586f, 19f, 10f)
            close()
        }
    }.build()
}
