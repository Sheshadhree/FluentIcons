package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AddCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AddCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            reflectiveCurveTo(7.373f, 2f, 14f, 2f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(-0.38f, 0f, -0.694f, 0.282f, -0.743f, 0.648f)
            lineTo(13.25f, 8.75f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(8.336f, 13.25f, 8f, 13.586f, 8f, 14f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(8.75f, 14.75f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineToRelative(0.007f, -0.102f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.38f, -0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(19.25f, 13.25f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(-4.5f)
            curveTo(14.75f, 8.336f, 14.414f, 8f, 14f, 8f)
            close()
        }
    }.build()
}
