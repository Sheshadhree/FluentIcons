package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Camera24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Camera24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.925f, 2.504f)
            curveToRelative(0.797f, 0f, 1.536f, 0.422f, 1.94f, 1.11f)
            lineToRelative(0.814f, 1.387f)
            horizontalLineToRelative(2.071f)
            curveTo(20.545f, 5f, 22f, 6.456f, 22f, 8.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.546f, 2f, 17.75f)
            verticalLineToRelative(-9.5f)
            curveTo(2f, 6.456f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineToRelative(2.08f)
            lineToRelative(0.875f, -1.424f)
            curveToRelative(0.41f, -0.667f, 1.135f, -1.073f, 1.917f, -1.073f)
            horizontalLineToRelative(3.803f)
            close()
            moveTo(12f, 8f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveTo(9.515f, 17f, 12f, 17f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(14.485f, 8f, 12f, 8f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            close()
        }
    }.build()
}
