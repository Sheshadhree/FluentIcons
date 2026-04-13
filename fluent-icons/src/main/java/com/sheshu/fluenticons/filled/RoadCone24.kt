package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RoadCone24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.194f, 2f)
            curveToRelative(-0.577f, 0f, -1.079f, 0.394f, -1.215f, 0.955f)
            curveTo(9.288f, 5.797f, 8.444f, 8.905f, 7.594f, 12f)
            horizontalLineToRelative(5.156f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(7.181f)
            lineToRelative(-0.55f, 2f)
            horizontalLineToRelative(7.119f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(14.164f, 17f, 13.75f, 17f)
            horizontalLineTo(6.222f)
            curveToRelative(-0.325f, 1.198f, -0.639f, 2.37f, -0.932f, 3.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 20.5f, 2f, 20.836f, 2f, 21.25f)
            reflectiveCurveTo(2.336f, 22f, 2.75f, 22f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.54f)
            lineTo(14.023f, 2.928f)
            curveTo(13.878f, 2.38f, 13.382f, 2f, 12.816f, 2f)
            horizontalLineToRelative(-1.622f)
            close()
        }
    }.build()
}
