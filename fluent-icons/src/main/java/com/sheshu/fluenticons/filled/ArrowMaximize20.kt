package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowMaximize20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMaximize20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.75f, 3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(15f, 10.664f, 15f, 10.25f)
            verticalLineTo(6.06f)
            lineTo(6.06f, 15f)
            horizontalLineToRelative(4.19f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-6f)
            curveTo(3.5f, 9.336f, 3.836f, 9f, 4.25f, 9f)
            reflectiveCurveTo(5f, 9.336f, 5f, 9.75f)
            verticalLineToRelative(4.19f)
            lineTo(13.94f, 5f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 5f, 9f, 4.664f, 9f, 4.25f)
            reflectiveCurveTo(9.336f, 3.5f, 9.75f, 3.5f)
            horizontalLineToRelative(6f)
            close()
        }
    }.build()
}
