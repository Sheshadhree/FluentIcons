package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 16.25f)
            curveTo(8f, 16.664f, 8.334f, 17f, 8.75f, 17f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-7.5f)
            curveTo(17f, 8.334f, 16.664f, 8f, 16.25f, 8f)
            reflectiveCurveTo(15.5f, 8.334f, 15.5f, 8.75f)
            verticalLineToRelative(5.69f)
            lineTo(4.28f, 3.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(14.44f, 15.5f)
            horizontalLineTo(8.75f)
            curveTo(8.334f, 15.5f, 8f, 15.836f, 8f, 16.25f)
            close()
        }
    }.build()
}
