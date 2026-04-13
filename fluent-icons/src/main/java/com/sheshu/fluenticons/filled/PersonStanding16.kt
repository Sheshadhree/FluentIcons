package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonStanding16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonStanding16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 4.5f)
            curveToRelative(0.967f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            reflectiveCurveTo(8.467f, 1f, 7.5f, 1f)
            reflectiveCurveTo(5.75f, 1.783f, 5.75f, 2.75f)
            reflectiveCurveTo(6.534f, 4.5f, 7.5f, 4.5f)
            close()
            moveToRelative(3.5f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.551f, -0.448f, 1f, -1f, 1f)
            verticalLineTo(14f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(7f, 10.724f, 7f, 11f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.449f, -1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.916f, 0.623f, -1.682f, 1.464f, -1.918f)
            curveTo(5.968f, 5.141f, 6.69f, 5.5f, 7.5f, 5.5f)
            reflectiveCurveToRelative(1.532f, -0.359f, 2.036f, -0.918f)
            curveTo(10.378f, 4.818f, 11f, 5.584f, 11f, 6.5f)
            close()
        }
    }.build()
}
