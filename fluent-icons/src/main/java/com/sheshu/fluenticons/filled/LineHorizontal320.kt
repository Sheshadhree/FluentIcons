package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal320: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal320",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 4f, 18f, 4.336f, 18f, 4.75f)
            reflectiveCurveTo(17.664f, 5.5f, 17.25f, 5.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5.5f, 2f, 5.164f, 2f, 4.75f)
            close()
            moveToRelative(0f, 5f)
            curveTo(2f, 9.336f, 2.336f, 9f, 2.75f, 9f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 9f, 18f, 9.336f, 18f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.5f, 2f, 10.164f, 2f, 9.75f)
            close()
            moveTo(2.75f, 14f)
            curveTo(2.336f, 14f, 2f, 14.336f, 2f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 14f, 17.25f, 14f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
