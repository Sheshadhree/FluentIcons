package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EqualCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EqualCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 8f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
            moveTo(4.5f, 6.5f)
            curveTo(4.5f, 6.776f, 4.724f, 7f, 5f, 7f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.276f, 6f, 11f, 6f)
            horizontalLineTo(5f)
            curveTo(4.724f, 6f, 4.5f, 6.224f, 4.5f, 6.5f)
            close()
            moveTo(5f, 9f)
            curveTo(4.724f, 9f, 4.5f, 9.224f, 4.5f, 9.5f)
            reflectiveCurveTo(4.724f, 10f, 5f, 10f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.276f, 9f, 11f, 9f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
