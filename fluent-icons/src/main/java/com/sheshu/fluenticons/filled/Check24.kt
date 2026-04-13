package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Check24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Check24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.77f, 5.79f)
            curveToRelative(0.299f, -0.287f, 0.308f, -0.762f, 0.02f, -1.06f)
            curveToRelative(-0.287f, -0.299f, -0.762f, -0.308f, -1.06f, -0.02f)
            lineToRelative(-6.75f, 6.5f)
            curveToRelative(-0.299f, 0.287f, -0.308f, 0.762f, -0.02f, 1.06f)
            curveToRelative(0.287f, 0.299f, 0.762f, 0.308f, 1.06f, 0.02f)
            lineToRelative(6.75f, -6.5f)
            close()
            moveTo(18.987f, 5f)
            horizontalLineTo(4.55f)
            curveTo(3.142f, 5f, 2f, 6.142f, 2f, 7.55f)
            verticalLineToRelative(6.9f)
            curveTo(2f, 15.858f, 3.142f, 17f, 4.55f, 17f)
            horizontalLineToRelative(14.9f)
            curveToRelative(1.408f, 0f, 2.55f, -1.142f, 2.55f, -2.55f)
            verticalLineToRelative(-6.9f)
            curveToRelative(0f, -0.185f, -0.02f, -0.365f, -0.057f, -0.538f)
            lineToRelative(-6.23f, 5.999f)
            curveToRelative(-0.695f, 0.67f, -1.803f, 0.65f, -2.474f, -0.047f)
            curveToRelative(-0.67f, -0.696f, -0.65f, -1.804f, 0.047f, -2.475f)
            lineTo(18.986f, 5f)
            close()
            moveTo(4.5f, 9.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(2f)
            curveTo(7.664f, 8.5f, 8f, 8.836f, 8f, 9.25f)
            reflectiveCurveTo(7.664f, 10f, 7.25f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(4.836f, 10f, 4.5f, 9.664f, 4.5f, 9.25f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(4.5f, 12.336f, 4.836f, 12f, 5.25f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
