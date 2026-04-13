package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Info16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Info16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(0f, 5.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.413f, 4.751f, 8f, 4.751f)
            reflectiveCurveTo(7.251f, 5.086f, 7.251f, 5.5f)
            reflectiveCurveTo(7.586f, 6.25f, 8f, 6.25f)
            close()
            moveTo(8.5f, 7.5f)
            curveTo(8.5f, 7.224f, 8.276f, 7f, 8f, 7f)
            reflectiveCurveTo(7.5f, 7.224f, 7.5f, 7.5f)
            verticalLineToRelative(3f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
