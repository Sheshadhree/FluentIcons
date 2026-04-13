package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBounce12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBounce12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.75f)
            curveTo(1f, 3.336f, 1.336f, 3f, 1.75f, 3f)
            horizontalLineToRelative(3.5f)
            curveTo(5.664f, 3f, 6f, 3.336f, 6f, 3.75f)
            reflectiveCurveTo(5.664f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(3.56f)
            lineTo(6.5f, 7.44f)
            lineToRelative(3.22f, -3.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(7.03f, 9.03f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(2.5f, 5.56f)
            verticalLineToRelative(1.69f)
            curveTo(2.5f, 7.664f, 2.164f, 8f, 1.75f, 8f)
            reflectiveCurveTo(1f, 7.664f, 1f, 7.25f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
