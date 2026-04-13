package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal2DashesSolid16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal2DashesSolid16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 5f)
            curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
            reflectiveCurveTo(2.336f, 6.5f, 2.75f, 6.5f)
            horizontalLineToRelative(1.5f)
            curveTo(4.664f, 6.5f, 5f, 6.164f, 5f, 5.75f)
            reflectiveCurveTo(4.664f, 5f, 4.25f, 5f)
            horizontalLineToRelative(-1.5f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(6.836f, 5f, 6.5f, 5.336f, 6.5f, 5.75f)
            reflectiveCurveTo(6.836f, 6.5f, 7.25f, 6.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(9.164f, 5f, 8.75f, 5f)
            horizontalLineToRelative(-1.5f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(11.336f, 5f, 11f, 5.336f, 11f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(1.5f)
            curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
            reflectiveCurveTo(13.664f, 5f, 13.25f, 5f)
            horizontalLineToRelative(-1.5f)
            close()
            moveToRelative(-9f, 5f)
            curveTo(2.336f, 10f, 2f, 10.336f, 2f, 10.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.664f, 10f, 13.25f, 10f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
