package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonSearch20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSearch20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(4.865f, 14.797f)
            curveToRelative(-1.071f, 0.683f, -2.454f, 1.064f, -3.962f, 1.171f)
            curveToRelative(-0.073f, -0.192f, -0.187f, -0.373f, -0.342f, -0.529f)
            lineToRelative(-2f, -1.999f)
            curveTo(8.843f, 14.853f, 9f, 14.195f, 9f, 13.5f)
            curveToRelative(0f, -0.925f, -0.28f, -1.785f, -0.758f, -2.5f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.896f, 2f, 2f)
            curveToRelative(0f, 1.691f, -0.833f, 2.966f, -2.135f, 3.797f)
            close()
            moveTo(4.5f, 17f)
            curveToRelative(0.786f, 0f, 1.512f, -0.26f, 2.096f, -0.697f)
            lineToRelative(2.55f, 2.55f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineToRelative(-2.55f, -2.55f)
            curveTo(7.741f, 15.012f, 8f, 14.286f, 8f, 13.5f)
            curveTo(8f, 11.567f, 6.433f, 10f, 4.5f, 10f)
            reflectiveCurveTo(1f, 11.567f, 1f, 13.5f)
            reflectiveCurveTo(2.567f, 17f, 4.5f, 17f)
            close()
            moveToRelative(0f, -1f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            reflectiveCurveTo(3.12f, 11f, 4.5f, 11f)
            reflectiveCurveTo(7f, 12.12f, 7f, 13.5f)
            reflectiveCurveTo(5.88f, 16f, 4.5f, 16f)
            close()
        }
    }.build()
}
