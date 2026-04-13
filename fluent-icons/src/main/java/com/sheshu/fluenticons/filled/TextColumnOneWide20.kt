package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColumnOneWide20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnOneWide20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            reflectiveCurveTo(3.336f, 6.5f, 3.75f, 6.5f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 6.5f, 17f, 6.164f, 17f, 5.75f)
            reflectiveCurveTo(16.664f, 5f, 16.25f, 5f)
            horizontalLineTo(3.75f)
            close()
            moveToRelative(0f, 3f)
            curveTo(3.336f, 8f, 3f, 8.336f, 3f, 8.75f)
            reflectiveCurveTo(3.336f, 9.5f, 3.75f, 9.5f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 9.5f, 17f, 9.164f, 17f, 8.75f)
            reflectiveCurveTo(16.664f, 8f, 16.25f, 8f)
            horizontalLineTo(3.75f)
            close()
            moveTo(3f, 11.75f)
            curveTo(3f, 11.336f, 3.336f, 11f, 3.75f, 11f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 12.5f, 3f, 12.164f, 3f, 11.75f)
            close()
            moveTo(3.75f, 14f)
            curveTo(3.336f, 14f, 3f, 14.336f, 3f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.664f, 14f, 16.25f, 14f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
