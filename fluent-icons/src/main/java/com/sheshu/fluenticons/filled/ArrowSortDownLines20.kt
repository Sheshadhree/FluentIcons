package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortDownLines20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortDownLines20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 2.75f)
            curveTo(15f, 2.336f, 14.664f, 2f, 14.25f, 2f)
            reflectiveCurveTo(13.5f, 2.336f, 13.5f, 2.75f)
            verticalLineToRelative(12.572f)
            lineToRelative(-1.447f, -1.579f)
            curveToRelative(-0.28f, -0.305f, -0.755f, -0.326f, -1.06f, -0.046f)
            curveToRelative(-0.305f, 0.28f, -0.326f, 0.755f, -0.046f, 1.06f)
            lineToRelative(2.75f, 3f)
            curveTo(13.84f, 17.912f, 14.04f, 18f, 14.25f, 18f)
            curveToRelative(0.21f, 0f, 0.41f, -0.088f, 0.553f, -0.243f)
            lineToRelative(2.75f, -3f)
            curveToRelative(0.28f, -0.306f, 0.26f, -0.78f, -0.046f, -1.06f)
            reflectiveCurveToRelative(-0.78f, -0.26f, -1.06f, 0.046f)
            lineTo(15f, 15.322f)
            verticalLineTo(2.75f)
            close()
            moveTo(2.75f, 3.5f)
            curveTo(2.336f, 3.5f, 2f, 3.836f, 2f, 4.25f)
            reflectiveCurveTo(2.336f, 5f, 2.75f, 5f)
            horizontalLineToRelative(8.5f)
            curveTo(11.664f, 5f, 12f, 4.664f, 12f, 4.25f)
            reflectiveCurveTo(11.664f, 3.5f, 11.25f, 3.5f)
            horizontalLineToRelative(-8.5f)
            close()
            moveTo(5f, 7.25f)
            curveTo(5f, 6.836f, 5.336f, 6.5f, 5.75f, 6.5f)
            horizontalLineToRelative(5.5f)
            curveTo(11.664f, 6.5f, 12f, 6.836f, 12f, 7.25f)
            reflectiveCurveTo(11.664f, 8f, 11.25f, 8f)
            horizontalLineToRelative(-5.5f)
            curveTo(5.336f, 8f, 5f, 7.664f, 5f, 7.25f)
            close()
            moveTo(8.75f, 9.5f)
            curveTo(8.336f, 9.5f, 8f, 9.836f, 8f, 10.25f)
            reflectiveCurveTo(8.336f, 11f, 8.75f, 11f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(11.664f, 9.5f, 11.25f, 9.5f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
