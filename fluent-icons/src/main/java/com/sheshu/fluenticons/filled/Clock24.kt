package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.25f, 13.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-6f)
            curveTo(10.5f, 6.336f, 10.836f, 6f, 11.25f, 6f)
            reflectiveCurveTo(12f, 6.336f, 12f, 6.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            close()
            moveTo(12f, 2f)
            curveTo(6.478f, 2f, 2f, 6.478f, 2f, 12f)
            reflectiveCurveToRelative(4.478f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.478f, 10f, -10f)
            reflectiveCurveTo(17.522f, 2f, 12f, 2f)
            close()
        }
    }.build()
}
