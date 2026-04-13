package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.History32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.History32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 7.693f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            reflectiveCurveTo(5f, 3.224f, 5f, 3.5f)
            verticalLineToRelative(6f)
            curveTo(5f, 9.776f, 5.224f, 10f, 5.5f, 10f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 9f, 11.5f, 9f)
            horizontalLineTo(6.252f)
            curveTo(8.431f, 5.972f, 11.985f, 4f, 16f, 4f)
            curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(4f, 22.627f, 4f, 16f)
            curveToRelative(0f, -0.48f, 0.028f, -0.954f, 0.083f, -1.419f)
            curveTo(4.119f, 14.276f, 3.886f, 14f, 3.579f, 14f)
            curveToRelative(-0.245f, 0f, -0.455f, 0.179f, -0.484f, 0.422f)
            curveTo(3.032f, 14.939f, 3f, 15.466f, 3f, 16f)
            curveToRelative(0f, 7.18f, 5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            reflectiveCurveTo(23.18f, 3f, 16f, 3f)
            curveTo(11.98f, 3f, 8.385f, 4.825f, 6f, 7.693f)
            close()
            moveTo(15.5f, 8f)
            curveTo(15.776f, 8f, 16f, 8.224f, 16f, 8.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(21.776f, 17f, 21.5f, 17f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-8f)
            curveTo(15f, 8.224f, 15.224f, 8f, 15.5f, 8f)
            close()
        }
    }.build()
}
