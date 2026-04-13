package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextWrap16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextWrap16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3f)
            curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
            reflectiveCurveTo(2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 4.5f, 14f, 4.164f, 14f, 3.75f)
            reflectiveCurveTo(13.664f, 3f, 13.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveToRelative(0f, 4f)
            curveTo(2.336f, 7f, 2f, 7.336f, 2f, 7.75f)
            reflectiveCurveTo(2.336f, 8.5f, 2.75f, 8.5f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(12.94f, 11f, 12.25f, 11f)
            horizontalLineToRelative(-1.69f)
            lineToRelative(0.22f, -0.22f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-0.22f, -0.22f)
            horizontalLineToRelative(1.69f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            reflectiveCurveTo(13.769f, 7f, 12.25f, 7f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(2f, 11.75f)
            curveTo(2f, 11.336f, 2.336f, 11f, 2.75f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(6.164f, 12.5f, 5.75f, 12.5f)
            horizontalLineToRelative(-3f)
            curveTo(2.336f, 12.5f, 2f, 12.164f, 2f, 11.75f)
            close()
        }
    }.build()
}
