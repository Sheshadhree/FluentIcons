package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tv48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tv48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 12.75f)
            curveTo(4f, 10.127f, 6.127f, 8f, 8.75f, 8f)
            horizontalLineToRelative(30.5f)
            curveTo(41.873f, 8f, 44f, 10.127f, 44f, 12.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(8.75f)
            curveTo(6.127f, 36f, 4f, 33.873f, 4f, 31.25f)
            verticalLineToRelative(-18.5f)
            close()
            moveToRelative(7.25f, 26.75f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(10.56f, 42f, 11.25f, 42f)
            horizontalLineToRelative(25.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-25.5f)
            close()
        }
    }.build()
}
