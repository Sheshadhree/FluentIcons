package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal416: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal416",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3f)
            curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
            reflectiveCurveTo(2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 4.5f, 14f, 4.164f, 14f, 3.75f)
            reflectiveCurveTo(13.664f, 3f, 13.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveToRelative(0f, 3f)
            curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
            reflectiveCurveTo(2.336f, 7.5f, 2.75f, 7.5f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 7.5f, 14f, 7.164f, 14f, 6.75f)
            reflectiveCurveTo(13.664f, 6f, 13.25f, 6f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 9.75f)
            curveTo(2f, 9.336f, 2.336f, 9f, 2.75f, 9f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 9f, 14f, 9.336f, 14f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.5f, 2f, 10.164f, 2f, 9.75f)
            close()
            moveTo(2.75f, 12f)
            curveTo(2.336f, 12f, 2f, 12.336f, 2f, 12.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.664f, 12f, 13.25f, 12f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
