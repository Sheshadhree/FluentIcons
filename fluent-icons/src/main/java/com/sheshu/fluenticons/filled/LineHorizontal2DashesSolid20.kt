package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal2DashesSolid20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal2DashesSolid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 6f)
            curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
            reflectiveCurveTo(2.336f, 7.5f, 2.75f, 7.5f)
            horizontalLineToRelative(2.5f)
            curveTo(5.664f, 7.5f, 6f, 7.164f, 6f, 6.75f)
            reflectiveCurveTo(5.664f, 6f, 5.25f, 6f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(6f, 0f)
            curveTo(8.336f, 6f, 8f, 6.336f, 8f, 6.75f)
            reflectiveCurveTo(8.336f, 7.5f, 8.75f, 7.5f)
            horizontalLineToRelative(2.5f)
            curveTo(11.664f, 7.5f, 12f, 7.164f, 12f, 6.75f)
            reflectiveCurveTo(11.664f, 6f, 11.25f, 6f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(6f, 0f)
            curveTo(14.336f, 6f, 14f, 6.336f, 14f, 6.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveTo(17.664f, 7.5f, 18f, 7.164f, 18f, 6.75f)
            reflectiveCurveTo(17.664f, 6f, 17.25f, 6f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(-12f, 6f)
            curveTo(2.336f, 12f, 2f, 12.336f, 2f, 12.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 12f, 17.25f, 12f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
