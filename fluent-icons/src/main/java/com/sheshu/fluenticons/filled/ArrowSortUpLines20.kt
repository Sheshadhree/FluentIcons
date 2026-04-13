package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortUpLines20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortUpLines20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 17.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.678f)
            lineToRelative(-1.447f, 1.579f)
            curveToRelative(-0.28f, 0.305f, -0.755f, 0.326f, -1.06f, 0.046f)
            curveToRelative(-0.305f, -0.28f, -0.326f, -0.754f, -0.046f, -1.06f)
            lineToRelative(2.75f, -3f)
            curveTo(13.84f, 2.088f, 14.04f, 2f, 14.25f, 2f)
            curveToRelative(0.21f, 0f, 0.41f, 0.088f, 0.553f, 0.243f)
            lineToRelative(2.75f, 3f)
            curveToRelative(0.28f, 0.306f, 0.26f, 0.78f, -0.046f, 1.06f)
            reflectiveCurveToRelative(-0.78f, 0.26f, -1.06f, -0.046f)
            lineTo(15f, 4.678f)
            verticalLineTo(17.25f)
            close()
            moveTo(2.75f, 16.5f)
            curveTo(2.336f, 16.5f, 2f, 16.164f, 2f, 15.75f)
            reflectiveCurveTo(2.336f, 15f, 2.75f, 15f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-8.5f)
            close()
            moveTo(5f, 12.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(11.664f, 12f, 11.25f, 12f)
            horizontalLineToRelative(-5.5f)
            curveTo(5.336f, 12f, 5f, 12.336f, 5f, 12.75f)
            close()
            moveToRelative(3.75f, -2.25f)
            curveTo(8.336f, 10.5f, 8f, 10.164f, 8f, 9.75f)
            reflectiveCurveTo(8.336f, 9f, 8.75f, 9f)
            horizontalLineToRelative(2.5f)
            curveTo(11.664f, 9f, 12f, 9.336f, 12f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
