package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RatingMature16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RatingMature16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(3.924f, 0.735f)
            curveToRelative(-0.118f, -0.19f, -0.347f, -0.277f, -0.562f, -0.216f)
            curveTo(5.148f, 5.081f, 5f, 5.277f, 5f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(5f, 10.776f, 5.224f, 11f, 5.5f, 11f)
            reflectiveCurveTo(6f, 10.776f, 6f, 10.5f)
            verticalLineTo(7.243f)
            lineToRelative(1.576f, 2.522f)
            curveTo(7.667f, 9.911f, 7.828f, 10f, 8f, 10f)
            reflectiveCurveToRelative(0.333f, -0.089f, 0.424f, -0.235f)
            lineTo(10f, 7.243f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.223f, -0.148f, -0.42f, -0.362f, -0.48f)
            curveToRelative(-0.215f, -0.062f, -0.444f, 0.026f, -0.562f, 0.215f)
            lineTo(8f, 8.557f)
            lineTo(5.924f, 5.235f)
            close()
        }
    }.build()
}
