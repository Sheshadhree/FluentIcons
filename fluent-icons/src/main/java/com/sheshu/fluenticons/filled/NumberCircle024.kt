package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle024: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 12f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            close()
            moveTo(9.75f, 12f)
            curveToRelative(0f, -1.263f, 0.184f, -2.302f, 0.565f, -3f)
            curveTo(10.664f, 8.36f, 11.173f, 8f, 12f, 8f)
            curveToRelative(0.827f, 0f, 1.336f, 0.36f, 1.685f, 1f)
            curveToRelative(0.38f, 0.698f, 0.565f, 1.737f, 0.565f, 3f)
            reflectiveCurveToRelative(-0.184f, 2.302f, -0.565f, 3f)
            curveToRelative(-0.349f, 0.64f, -0.858f, 1f, -1.685f, 1f)
            curveToRelative(-0.827f, 0f, -1.336f, -0.36f, -1.685f, -1f)
            curveToRelative(-0.38f, -0.698f, -0.565f, -1.737f, -0.565f, -3f)
            close()
            moveTo(12f, 6.5f)
            curveToRelative(-1.423f, 0f, -2.414f, 0.703f, -3.002f, 1.782f)
            curveTo(8.44f, 9.304f, 8.25f, 10.64f, 8.25f, 12f)
            curveToRelative(0f, 1.36f, 0.19f, 2.696f, 0.748f, 3.718f)
            curveToRelative(0.588f, 1.08f, 1.58f, 1.782f, 3.002f, 1.782f)
            curveToRelative(1.423f, 0f, 2.414f, -0.703f, 3.002f, -1.782f)
            curveTo(15.56f, 14.696f, 15.75f, 13.36f, 15.75f, 12f)
            curveToRelative(0f, -1.36f, -0.19f, -2.696f, -0.748f, -3.718f)
            curveTo(14.414f, 7.202f, 13.422f, 6.5f, 12f, 6.5f)
            close()
        }
    }.build()
}
